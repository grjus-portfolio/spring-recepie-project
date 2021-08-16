package com.traing.grjus.recepieproject.domain

import javax.persistence.*

@Entity
data class Recipe(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    var id:Long?,
    var description:String,
    var prepTime:String,
    var cookTime:Int,
    var serving:Int,
    var source:String,
    var url:String,
    var directions:String,
    @Enumerated(value=EnumType.ORDINAL)
    var difficulty:Difficulty,
    @Lob
    var image:ByteArray,
    @OneToOne(cascade = [CascadeType.ALL])
    var notes:Note,
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "recipe")
    var ingredient:Set<Ingredient>,

    @ManyToMany
    @JoinTable(name="recipe_category",
        joinColumns = [JoinColumn(name="recipe_id")],
        inverseJoinColumns = [JoinColumn(name="category_id")]
        )
    var categories:Set<Category>
)