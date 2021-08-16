package com.traing.grjus.recepieproject.domain

import javax.persistence.*

@Entity
class Note(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @OneToOne
    var recipe: Recipe,

    @Lob
    var recipeNotes: String,
)