import org.junit.Test

import org.junit.Assert.*
import ru.netology.*
import ru.netology.WallService
import ru.netology.Comments
import java.lang.RuntimeException

class WallServiceTest {

    @Test
    fun createCommentIfPostHave() {
        val postId: Int = 1
        val postOne = Post(1,165002,165003,777,1650508085,"One",77,88,true,
            Comments(12,true,true,true,true), copyright(12,"","New name", "type"),
            likes(100,true,true,true), repost(15,true), views(200), "post",
            geo("Cont", "55.55 49.49"),101,true, false,false,true,true,
            true, donut(false,1662000, "No dount", true,"All"),
            false
        )
        var comments = emptyArray<Comments>()
        val comment = Comments(12,true,false,true,true)
            if (postOne.id == postId){
                comments += comment
            }
        val result = comments.size

        assertEquals(1, result)

    }
    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
        val postId = 4

            WallService.createComment(postId, Comments(12,true, false,true,true))
    }
}