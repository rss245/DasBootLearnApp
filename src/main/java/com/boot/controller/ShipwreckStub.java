package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Shipwreck;

public class ShipwreckStub {
        private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
        private static Long idIndex = 5L;

        //populate initial wrecks
        static {
                Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 1023.110, 138.44, 1994);
                wrecks.put(1L, a);
                Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 180.90, 138.44, 1994);
                wrecks.put(2L, b);
                Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 17890.120, 138.44, 1994);
                wrecks.put(3L, c);
                Shipwreck d = new Shipwreck(4L, "S.S. Wasp", "Aircraft Carrier wrecked on the great barrier reef", "Keep", 50, 44.12, 138.44, 2010);
                wrecks.put(4L, d);
                Shipwreck e = new Shipwreck(5L, "S.S. Mamaneric", "Civil war battleship", "OLD", 50, 4488.12, 138.44, 1868);
                wrecks.put(5L, e);
        }

        public static List<Shipwreck> list() {
                return new ArrayList<Shipwreck> (wrecks.values());
        }

        public static Shipwreck create(Shipwreck wreck) {
                idIndex += idIndex;
                wreck.setId(idIndex);
                wrecks.put(idIndex, wreck);
                return wreck;
        }

        public static Shipwreck get(Long id) {
                return wrecks.get(id);
        }

        public static Shipwreck update(Long id, Shipwreck wreck) {
                wrecks.put(id, wreck);
                return wreck;
        }

        public static Shipwreck delete(Long id) {
                return wrecks.remove(id);
        }
}

