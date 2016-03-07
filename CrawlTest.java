import static org.junit.Assert.*;

import org.junit.Test;

public class CrawlTest {

	@Test
	public void test() {
		Crawler.init();
		Crawler.readAllLineFromAllFilesRecursively(Crawler.ROOT_DIR, null);
		
		String keyword = "thro";
		int times = Crawler.findStartingMatch(keyword);
		
		
		assertEquals(Crawler.findStartingMatch(keyword), times);
	}

}
