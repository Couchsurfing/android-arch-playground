package com.nicolasmilliard.playground.api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class ItemServiceImpl : ItemService {
    override suspend fun load() = withContext(Dispatchers.IO) {
        delay(3000) // Doing IO operations
        listOf(
            Item(
                "id1",
                "Title 1",
                "Description 1",
                "https://a0.muscache.com/4ea/air/v2/pictures/e3b8d12c-07dc-4f3d-9cdc-c79e0a442dd4.jpg?t=r:w375-h250-sfit,e:fjpg-c80"
            ),
            Item(
                "id2",
                "Title 2",
                "Description 2",
                "https://a0.muscache.com/4ea/air/v2/pictures/3d3a87bc-9a2c-47b7-8a36-22969be34e5d.jpg?t=r:w375-h250-sfit,e:fjpg-c80"
            ),
            Item(
                "id3",
                "Title 3",
                "Description 3",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/paris-e1ab66dec9338fcc1c25e9114b837f60.jpg"
            ),
            Item(
                "id4",
                "Title 4",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id5",
                "Title 5",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id6",
                "Title 6",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id7",
                "Title 7",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id8",
                "Title 8",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id9",
                "Title 9",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id10",
                "Title 10",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id11",
                "Title 11",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id12",
                "Title 12",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
            ,
            Item(
                "id13",
                "Title 13",
                "Description 4",
                "https://a0.muscache.com/airbnb/static/magical_trips/p2_intercepts/london-e380c908f135295c9085d693579239e5.jpg"
            )
        )
    }
}