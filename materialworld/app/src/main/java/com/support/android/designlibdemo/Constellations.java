/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.support.android.designlibdemo;

import java.util.Random;

public class Constellations {

    private static final Random RANDOM = new Random();

    public static int getRandomConstellationDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.cheese_1;
            case 1:
                return R.drawable.cheese_2;
            case 2:
                return R.drawable.cheese_3;
            case 3:
                return R.drawable.cheese_4;
            case 4:
                return R.drawable.cheese_5;
        }
    }

    public static final String[] constellations = {
            "Andromeda",
            "Antlia",
            "Apus",
            "Aquarius",
            "Aquila",
            "Ara",
            "Aries",
            "Auriga",
            "Boötes",
            "Caelum",
            "Camelopardalis",
            "Cancer",
            "Canes Venatici",
            "Canis Major",
            "Canis Minor",
            "Capricornus",
            "Carina",
            "Cassiopeia",
            "Centaurus",
            "Cepheus",
            "Cetus",
            "Chamaeleon",
            "Circinus",
            "Columba",
            "Coma Berenices",
            "Corona Austrina",
            "Corona Borealis",
            "Corvus",
            "Crater",
            "Crux",
            "Cygnus",
            "Delphinus",
            "Dorado",
            "Draco",
            "Equuleus",
            "Eridanus",
            "Fornax",
            "Gemini",
            "Grus",
            "Hercules",
            "Horologium",
            "Hydra",
            "Hydrus",
            "Indus",
            "Lacerta",
            "Leo",
            "Leo Minor",
            "Lepus",
            "Libra",
            "Lupus",
            "Lynx",
            "Lyra",
            "Mensa",
            "Microscopium",
            "Monoceros",
            "Musca",
            "Norma",
            "Octans",
            "Ophiuchus",
            "Orion",
            "Pavo",
            "Pegasus",
            "Perseus",
            "Phoenix",
            "Pictor",
            "Pisces",
            "Piscis Austrinus",
            "Puppis",
            "Pyxis",
            "Reticulum",
            "Sagitta",
            "Sagittarius",
            "Scorpius",
            "Sculptor",
            "Scutum",
            "Serpens",
            "Sextans",
            "Taurus",
            "Telescopium",
            "Triangulum",
            "Triangulum Australe",
            "Tucana",
            "Ursa Major",
            "Ursa Minor",
            "Vela",
            "Virgo",
            "Volans",
            "Vulpecula"
    };

}
