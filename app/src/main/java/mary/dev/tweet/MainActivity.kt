package mary.dev.tweet

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mary.dev.tweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweet()
    }
    fun displaytweet(){
        var tweet=Tweet("Uchedu Obialor","@uchedu433","1h","See you in Canada soon.","")
        var tweet1=Tweet("Favour Mwenda","@Fayvhoor","2h","Thank you ❤ and follow me for more.️","")
        var tweet2=Tweet("Francis Maina","@francis788","0h","Congratulation for getting a new position.","")
        var tweet3=Tweet("Tall Glass","@glasstall66","1h","Just smile, a smile is the best thing one have.","")
        var tweet4=Tweet("Spencer Nuhu","@NuhuSpencer","5h","What a day, had fun with my team.","")
        var tweet5=Tweet("Abiola Ibrahim","@abiola19","7h","She is strong,she is capable and brave.","")
        var tweet6=Tweet("OLuwa Seye","@Seye_official","5h","Come see me nailing it.","")
        var tweet7=Tweet("Dinzy Lau","@Dizy76876","6h","Tomorrow is a beautiful day.","")
        var tweet8=Tweet("Mary Wangare","@mmm76876","6h","We are here and it's me and you.","")


        var tweetlist= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        var tweetAdapter=TweetRvAdapter(tweetlist)
        binding.rvTweet.layoutManager=LinearLayoutManager(this)
        binding.rvTweet.adapter=tweetAdapter

    }
}