package workout.data

// TODO: Implement ID/Pointer to Thumbnail, Video/GIF
// TODO: Implement calories per a rep
data class Exercise(val name: String, val muscles: List<Muscle>, val movementType: MovementType)
