package mary.dev.tweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweetlist:List<Tweet>):RecyclerView.Adapter<TweeetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweeetViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return TweeetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweeetViewHolder, position: Int) {
        var currenttweet=tweetlist.get(position)
        holder.tvname.text=currenttweet.name
        holder.tvhandle.text=currenttweet.handle
        holder.tvhour.text=currenttweet.hour
        holder.tvmessagetweet.text=currenttweet.message

    }

    override fun getItemCount(): Int {
       return tweetlist.size
    }
}
class TweeetViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvhandle=itemView.findViewById<TextView>(R.id.tvhandle)
    var tvhour=itemView.findViewById<TextView>(R.id.tvhour)
    var tvmessagetweet=itemView.findViewById<TextView>(R.id.tvmessagetweet)
    var imgmessage=itemView.findViewById<ImageView>(R.id.imgmessage)




}