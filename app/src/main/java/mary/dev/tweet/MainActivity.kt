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
        var tweet=Tweet("Uchedu Obialor","@uchedu433","1h","See you in Canada soon.","","44","253","76")
        var tweet1=Tweet("Favour Mwenda","@Fayvhoor","2h","Thank you ❤ and follow me for more.️","","44","657","768")
        var tweet2=Tweet("Francis Maina","@francis788","0h","Congratulation for getting a new position.","","56","785","875")
        var tweet3=Tweet("Tall Glass","@glasstall66","1h","Just smile, a smile is the best thing one have.","","678","879","90")
        var tweet4=Tweet("Spencer Nuhu","@NuhuSpencer","5h","What a day, had fun with my team.","","87","895","75")
        var tweet5=Tweet("Abiola Ibrahim","@abiola19","7h","She is strong,she is capable and brave.","","657","89","9")
        var tweet6=Tweet("OLuwa Seye","@Seye_official","5h","Come see me nailing it.","","23","534","132")
        var tweet7=Tweet("Dinzy Lau","@Dizy76876","6h","Tomorrow is a beautiful day.","","456","768","867")
        var tweet8=Tweet("Mary Wangare","@mmm76876","6h","We are here and it's me and you.","","235","143","657")


        var tweetlist= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        var tweetAdapter=TweetRvAdapter(tweetlist)
        binding.rvTweet.layoutManager=LinearLayoutManager(this)
        binding.rvTweet.adapter=tweetAdapter

    }
}