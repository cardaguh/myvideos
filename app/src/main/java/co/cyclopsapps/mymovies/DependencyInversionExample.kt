package co.cyclopsapps.mymovies

//class Item

/* Original con problemas con acoplamiento
class RoomDatabase {
    fun requestItems(): List<Item> { TODO()}
}

class DataRepository {
    private val RoomDatabase = RoomDatabase()

    fun requestItems(): List<Item> {
        val items = RoomDatabase.requestItems()

        return items
    }
}*/

//Version con merojes practicas y menos acoplada, más testeable y extensible, mínimo acoplamiento

class Item

interface Database {
    fun requestItems(): List<Item>
}

class RoomDatabase : Database {
    override fun requestItems(): List<Item> { TODO()}
}

class DataRepository(private val database: Database) {
    //private val RoomDatabase = RoomDatabase()

    fun requestItems(): List<Item> {
        val items = database.requestItems()

        return items
    }
}