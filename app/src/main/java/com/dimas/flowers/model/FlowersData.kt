package com.dimas.flowers.model

import com.dimas.flowers.R



object FlowersData{



    private val flowerName = arrayOf(
            "Cyclamen",
            "Amaryllis",
            "Phalenopsis Orchid",
            "African violet",
            "Poinsettia",
            "Kalanchoe",
            "Hibiscus",
            "Peace lily",
            "Gloxinia",
            "Clivia",
            "Cape primrose",
            "Flowering maple"
    )

    private val flowerPhoto = arrayOf(
            R.drawable.cyclamen,
            R.drawable.amarylis,
            R.drawable.phalenopsis,
            R.drawable.african,
            R.drawable.poinsettia,
            R.drawable.kalanchoe,
            R.drawable.hibiscus,
            R.drawable.peace,
            R.drawable.gloxinia,
            R.drawable.clivia,
            R.drawable.cape,
            R.drawable.flowering
    )
    private val flowerLokasi = arrayOf(
            "Nelakurinji, India",
            "Mediterranean Basin east, Iran",
            "New Guinea",
            "Tanzania, in East Africa",
            "Mexico",
            "Madagascar",
            "Hawaii, China",
            "Southeastern Asia",
            "Brazil",
            "South Africa",
            "South Africa",
            "Southern Brazil"

    )
    

    private val flowerDetail = arrayOf(
            "Pink, lilac, red or white blooms float above heart-shaped leaves, with new blooms appearing for months. Give them bright light, and keep them lightly moist. They also prefer cool temps (60 to 70 degrees), or the leaves tend to yellow and die. It’s tough to get these to rebloom, so enjoy them at their peak and compost.",
            "These stunning flowers come from bulbs sold in the fall. Put them in a bright spot; too little light causes them to flop over. Keep the soil evenly moist. Blooms occur about six weeks later and last for a month or more. You can try to get them to rebloom next year: Save the bulb, leave the foliage intact but cut the faded flower stalk, then move into shade outdoors after the last frost. In late summer, let the bulb go dormant, cut off foliage, and don’t water until November. Then start to water again, and cross your fingers!",
            "These delicate-looking orchids are not as fragile as they appear. They’ll bloom for months and can live for years with little care. They prefer bright, indirect light (an east or west-facing window is best). Water once a week until it drains out of the bottom of the pot.",
            "These dainty old-time favorites in shades of purples, pinks, and whites bloom almost continuously. Some of these have been known to live for decades! They like to soak up indirect light on a window ledge facing south, east or west. Keep the soil lightly moist, and don’t let water drip on the fuzzy leaves because it will cause brown spots.",
            "These dainty old-time favorites in shades of purples, pinks, and whites bloom almost continuously. Some of these have been known to live for decades! They like to soak up indirect light on a window ledge facing south, east or west. Keep the soil lightly moist, and don’t let water drip on the fuzzy leaves because it will cause brown spots.",
            "This succulent boasts glossy green leaves and bright red, yellow, pink or orange flower clusters that last for weeks. It does best in bright indirect light and prefers to dry out between waterings. Cut off the flower head after it fizzles, then enjoy the foliage all year long. Occasionally, it will bloom again next year.",
            "Hibiscus is a stunning plant that adapts well to the right indoor environment. Its large flowers last only a few days, but it typically stays in bloom from spring to fall, and it lives for several years (typically, at least). Give it bright light to keep it blooming, and keep the soil evenly moist in summer, somewhat dry in winter.",
            "Shiny green leaves and spoon-shaped white flowers make this hardy houseplant a must-have. With the right conditions, these plants last for many years with almost no care. Peace lilies prefer low to moderate light but tend to bloom better with bright filtered light. They like moist, not soggy, soil.",
            "This relative of African violets has beautiful frilly flowers and deep green leaves. Many nurseries, florists or even grocery stores carry these in winter. They prefer bright filtered sunlight and moderately moist soil; they also don’t like to get their leaves wet. Enjoy their long flowering period (about two months), but know that they’re notoriously finicky about reblooming.",
            "This elegant flower, a member of the amaryllis family, has long-lasting orange or yellow flowers with long, strappy glossy leaves. It tolerates most light conditions. Let the plant dry out between waterings. It’s a long-lived plant, but getting it to rebloom can be tricky. Keep it outside in fall, then move to the coolest room in your house before the first frost. Keep it rather dry until midwinter, then gradually increase the water. You should have blooms in February or March.",
            "This evergreen perennial, also known as streptocarpus, has beautiful pink, white, purple or red tubular flowers and velvety foliage. It can last for years. It prefers bright light. Let the soil dry out between waterings, and don’t get the leaves wet to prevent ugly spotting.",
            "This evergreen perennial, also known as streptocarpus, has beautiful pink, white, purple or red tubular flowers and velvety foliage. It can last for years. It prefers bright light. Let the soil dry out between waterings, and don’t get the leaves wet to prevent ugly spotting."
    )


    val listData:  ArrayList<Flowers>
        get(){
                    val list = arrayListOf<Flowers>()
                    for(position in flowerName.indices){
                        val flower = Flowers()
                        flower.nama = flowerName[position]
                        flower.lokasi = flowerLokasi[position]
                        flower.photo = flowerPhoto[position]
                        flower.detail = flowerDetail[position]
                        list.add(flower)
                    }
                    return list
                }


}