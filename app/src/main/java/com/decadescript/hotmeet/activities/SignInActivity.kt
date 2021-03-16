package com.decadescript.hotmeet.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.decadescript.hotmeet.R
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        checkBt.setOnClickListener {
            layoutOne.visibility = GONE
            layoutTwo.visibility = VISIBLE
            question.text = "What are your\nexpectations\nfrom the perfect\nonline date?"
            answerOne.text = "Optimistic"
            answerTwo.text = "Neutral"
            answerThree.text = "Skeptical"
        }
        backBt.setOnClickListener {
            onBackPressed()
        }
        skipBt.setOnClickListener {
            count++
            changePic()
        }
        nextBt.setOnClickListener {
            count++
            changePic()
        }
        answerOne.setOnClickListener {
            count++
            changePic()
        }
        answerTwo.setOnClickListener {
            count++
            changePic()
        }
        answerThree.setOnClickListener {
            count++
            changePic()
        }

    }

    override fun onBackPressed() {
        --count
        if (count == -1) {
            super.onBackPressed()
        } else {
            changePic()
        }
    }


    private fun changePic() {

        when (count) {
            0 -> {
                image.setImageResource(R.drawable.pic_2)
                question.text = "What are your\nexpectations\nfrom the perfect\nonline date?"
                answerOne.text = "Optimistic"
                answerTwo.text = "Neutral"
                answerThree.text = "Skeptical"
            }
            1 -> {
                image.setImageResource(R.drawable.pic_3)
                question.text = "What are you\nlooking for here?"
                answerOne.text = "Serious relationships"
                answerTwo.text = "Just friendship and chatting"
                answerThree.text = "I am here for fun"
            }
            2 -> {
                image.setImageResource(R.drawable.pic_4)
                question.text = "What character\ntraits do you\nvalue in people? "
                answerOne.text = "Sociability and openness"
                answerTwo.text = "Attentiveness and respectful treatment of me"
                answerThree.text = "The main thing is that we have common hobbies"
                answerOne.textSize = 18f
                answerTwo.textSize = 16f
                answerThree.textSize = 16f
            }
            3 -> {
                image.setImageResource(R.drawable.pic_5)
                question.text = "Which of the\nfollowing\noptions\ndescribe you\nbetter?"
                answerOne.text = "I like meeting interesting people and build new connections"
                answerTwo.text =
                    "I'm rarely the first to start a conversation, but I can easily keep it going"
                answerThree.text =
                    "I am a quite shy person, it's hard for me to make new acquaintances"
                answerOne.textSize = 14f
                answerTwo.textSize = 12f
                answerThree.textSize = 12f

            }
            4 -> {
                image.setImageResource(R.drawable.pic_6)
                question.text = "How would you react to a failed date?"
                answerOne.text =
                    "All experience is important. I would learn a lesson and go further"
                answerTwo.text =
                    "I would be very upset and would analyze for a long time why it happened"
                answerThree.text =
                    "I wouldn't worry at all and go on a new date with another person."
                answerOne.textSize = 12f
                answerTwo.textSize = 12f
                answerThree.textSize = 12f
            }
            5 -> {
                image.setImageResource(R.drawable.pic_7)
                question.text = "What is the perfect date for you?"
                answerOne.text =
                    "I would prefer to go for a walk and just have a good time with my partner"
                answerTwo.text = "Evening in a gourmet restaurant would be just perfect"
                answerThree.text = "Chilling at home and watching a movie"
                answerOne.textSize = 12f
                answerTwo.textSize = 14f
                answerThree.textSize = 16f
            }
            6 -> {
                image.setImageResource(R.drawable.pic_8)
                question.text = "What do you pay attention to when you first meet a person?"
                answerOne.text = "Tidy and pleasant appearance"
                answerTwo.text = "Intellect and level of education"
                answerThree.text = "Social status"
                answerOne.textSize = 18f
                answerTwo.textSize = 18f
                answerThree.textSize = 18f
            }
            7 -> {
                image.setImageResource(R.drawable.pic_9)
                question.text =
                    "How quickly after meeting a person online are you ready to share personal information with him?"
                answerOne.text = "Very quickly"
                answerTwo.text = "Not quickly at al"
                answerThree.text = "Depends on the person"
                answerOne.textSize = 18f
                answerTwo.textSize = 18f
                answerThree.textSize = 18f
            }
            8 -> {
                image.setImageResource(R.drawable.pic_10)
                question.text =
                    "Do you believe, that it is possible to meet your better half online?"
                answerOne.text = "Yes"
                answerTwo.text = "Maybe"
                answerThree.text = "Definitely no"
                answerOne.textSize = 18f
                answerTwo.textSize = 18f
                answerThree.textSize = 18f
            }
            9 -> {
                count = 8
                startActivity(Intent(this, EndActivity::class.java))
            }

        }
    }

}