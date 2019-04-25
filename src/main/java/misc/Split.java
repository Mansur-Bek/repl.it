package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Split {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug";
//		String s = "Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,          du toe sdwx g@c s uded gw od!          tqsv v t v fnl'          o amka ll x s q_          a frs s ltubs?wdjfdrf x jk.jgkb d s d k n m@sedwkpe ev h_icr ggqxvap@          j g hva o kja q?          j j q ra iak c u!          vqnf t";
		String s = "";
		// Write your code here.
		int size = 0;
		List<String> arr = new ArrayList<>();
		s = s.trim();
		if (!s.isEmpty()) {
			s = s.trim().replace("\'", " ").replace(",", " ").replace("?", " ").replace("!", " ").replace("_", " ")
					.replace(".", " ").replace("@", " ").replaceAll("\\s+", " ");
			arr = Arrays.asList(s.split(" "));
			size = arr.size();
		}
		System.out.println(size);
		if (!s.isEmpty()) {
			for (String str : arr) {
				System.out.println(str);
			}
		}
		scan.close();
	}
}
