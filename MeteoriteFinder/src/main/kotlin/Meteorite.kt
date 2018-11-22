class Meteorite(val json:Map<String, Any?>){

    val name:String by json
    val fall:String by json
    val reclat:String by json
    val reclong:String by json
    val mass:String by json
    val year:String by json

    companion object {
        fun fromJsonList(jsonList:List<HashMap<String, Any>>):List<Meteorite>{
            val meteoriteList = mutableListOf<Meteorite>()
            jsonList.forEach { jsonObject ->
                val newMeteorite = Meteorite(jsonObject)
                if (newMeteorite.name != null
                        && newMeteorite.fall != null
                        && newMeteorite.reclat != null
                        && newMeteorite.reclong != null
                        && newMeteorite.mass != null
                        && newMeteorite.year != null){
                    meteoriteList.add(newMeteorite)
                }
            }

            return meteoriteList
        }
    }
}