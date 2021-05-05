// Generated by Snowball 2.0.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 *
 * <p>Generated by Snowball 2.0.0 - https://snowballstem.org/
 */
@SuppressWarnings("unused")
public class ArmenianStemmer extends org.tartarus.snowball.SnowballStemmer {

  private static final long serialVersionUID = 1L;
  private static final java.lang.invoke.MethodHandles.Lookup methodObject =
      java.lang.invoke.MethodHandles.lookup();

  private static final Among a_0[] = {
    new Among("\u0580\u0578\u0580\u0564", -1, 1),
    new Among("\u0565\u0580\u0578\u0580\u0564", 0, 1),
    new Among("\u0561\u056C\u056B", -1, 1),
    new Among("\u0561\u056F\u056B", -1, 1),
    new Among("\u0578\u0580\u0561\u056F", -1, 1),
    new Among("\u0565\u0572", -1, 1),
    new Among("\u0561\u056F\u0561\u0576", -1, 1),
    new Among("\u0561\u0580\u0561\u0576", -1, 1),
    new Among("\u0565\u0576", -1, 1),
    new Among("\u0565\u056F\u0565\u0576", 8, 1),
    new Among("\u0565\u0580\u0565\u0576", 8, 1),
    new Among("\u0578\u0580\u0567\u0576", -1, 1),
    new Among("\u056B\u0576", -1, 1),
    new Among("\u0563\u056B\u0576", 12, 1),
    new Among("\u0578\u057E\u056B\u0576", 12, 1),
    new Among("\u056C\u0561\u0575\u0576", -1, 1),
    new Among("\u057E\u0578\u0582\u0576", -1, 1),
    new Among("\u057A\u0565\u057D", -1, 1),
    new Among("\u056B\u057E", -1, 1),
    new Among("\u0561\u057F", -1, 1),
    new Among("\u0561\u057E\u0565\u057F", -1, 1),
    new Among("\u056F\u0578\u057F", -1, 1),
    new Among("\u0562\u0561\u0580", -1, 1)
  };

  private static final Among a_1[] = {
    new Among("\u0561", -1, 1),
    new Among("\u0561\u0581\u0561", 0, 1),
    new Among("\u0565\u0581\u0561", 0, 1),
    new Among("\u057E\u0565", -1, 1),
    new Among("\u0561\u0581\u0580\u056B", -1, 1),
    new Among("\u0561\u0581\u056B", -1, 1),
    new Among("\u0565\u0581\u056B", -1, 1),
    new Among("\u057E\u0565\u0581\u056B", 6, 1),
    new Among("\u0561\u056C", -1, 1),
    new Among("\u0568\u0561\u056C", 8, 1),
    new Among("\u0561\u0576\u0561\u056C", 8, 1),
    new Among("\u0565\u0576\u0561\u056C", 8, 1),
    new Among("\u0561\u0581\u0576\u0561\u056C", 8, 1),
    new Among("\u0565\u056C", -1, 1),
    new Among("\u0568\u0565\u056C", 13, 1),
    new Among("\u0576\u0565\u056C", 13, 1),
    new Among("\u0581\u0576\u0565\u056C", 15, 1),
    new Among("\u0565\u0581\u0576\u0565\u056C", 16, 1),
    new Among("\u0579\u0565\u056C", 13, 1),
    new Among("\u057E\u0565\u056C", 13, 1),
    new Among("\u0561\u0581\u057E\u0565\u056C", 19, 1),
    new Among("\u0565\u0581\u057E\u0565\u056C", 19, 1),
    new Among("\u057F\u0565\u056C", 13, 1),
    new Among("\u0561\u057F\u0565\u056C", 22, 1),
    new Among("\u0578\u057F\u0565\u056C", 22, 1),
    new Among("\u056F\u0578\u057F\u0565\u056C", 24, 1),
    new Among("\u057E\u0561\u056E", -1, 1),
    new Among("\u0578\u0582\u0574", -1, 1),
    new Among("\u057E\u0578\u0582\u0574", 27, 1),
    new Among("\u0561\u0576", -1, 1),
    new Among("\u0581\u0561\u0576", 29, 1),
    new Among("\u0561\u0581\u0561\u0576", 30, 1),
    new Among("\u0561\u0581\u0580\u056B\u0576", -1, 1),
    new Among("\u0561\u0581\u056B\u0576", -1, 1),
    new Among("\u0565\u0581\u056B\u0576", -1, 1),
    new Among("\u057E\u0565\u0581\u056B\u0576", 34, 1),
    new Among("\u0561\u056C\u056B\u057D", -1, 1),
    new Among("\u0565\u056C\u056B\u057D", -1, 1),
    new Among("\u0561\u057E", -1, 1),
    new Among("\u0561\u0581\u0561\u057E", 38, 1),
    new Among("\u0565\u0581\u0561\u057E", 38, 1),
    new Among("\u0561\u056C\u0578\u057E", -1, 1),
    new Among("\u0565\u056C\u0578\u057E", -1, 1),
    new Among("\u0561\u0580", -1, 1),
    new Among("\u0561\u0581\u0561\u0580", 43, 1),
    new Among("\u0565\u0581\u0561\u0580", 43, 1),
    new Among("\u0561\u0581\u0580\u056B\u0580", -1, 1),
    new Among("\u0561\u0581\u056B\u0580", -1, 1),
    new Among("\u0565\u0581\u056B\u0580", -1, 1),
    new Among("\u057E\u0565\u0581\u056B\u0580", 48, 1),
    new Among("\u0561\u0581", -1, 1),
    new Among("\u0565\u0581", -1, 1),
    new Among("\u0561\u0581\u0580\u0565\u0581", 51, 1),
    new Among("\u0561\u056C\u0578\u0582\u0581", -1, 1),
    new Among("\u0565\u056C\u0578\u0582\u0581", -1, 1),
    new Among("\u0561\u056C\u0578\u0582", -1, 1),
    new Among("\u0565\u056C\u0578\u0582", -1, 1),
    new Among("\u0561\u0584", -1, 1),
    new Among("\u0581\u0561\u0584", 57, 1),
    new Among("\u0561\u0581\u0561\u0584", 58, 1),
    new Among("\u0561\u0581\u0580\u056B\u0584", -1, 1),
    new Among("\u0561\u0581\u056B\u0584", -1, 1),
    new Among("\u0565\u0581\u056B\u0584", -1, 1),
    new Among("\u057E\u0565\u0581\u056B\u0584", 62, 1),
    new Among("\u0561\u0576\u0584", -1, 1),
    new Among("\u0581\u0561\u0576\u0584", 64, 1),
    new Among("\u0561\u0581\u0561\u0576\u0584", 65, 1),
    new Among("\u0561\u0581\u0580\u056B\u0576\u0584", -1, 1),
    new Among("\u0561\u0581\u056B\u0576\u0584", -1, 1),
    new Among("\u0565\u0581\u056B\u0576\u0584", -1, 1),
    new Among("\u057E\u0565\u0581\u056B\u0576\u0584", 69, 1)
  };

  private static final Among a_2[] = {
    new Among("\u0578\u0580\u0564", -1, 1),
    new Among("\u0578\u0582\u0575\u0569", -1, 1),
    new Among("\u0578\u0582\u0570\u056B", -1, 1),
    new Among("\u0581\u056B", -1, 1),
    new Among("\u056B\u056C", -1, 1),
    new Among("\u0561\u056F", -1, 1),
    new Among("\u0575\u0561\u056F", 5, 1),
    new Among("\u0561\u0576\u0561\u056F", 5, 1),
    new Among("\u056B\u056F", -1, 1),
    new Among("\u0578\u0582\u056F", -1, 1),
    new Among("\u0561\u0576", -1, 1),
    new Among("\u057A\u0561\u0576", 10, 1),
    new Among("\u057D\u057F\u0561\u0576", 10, 1),
    new Among("\u0561\u0580\u0561\u0576", 10, 1),
    new Among("\u0565\u0572\u0567\u0576", -1, 1),
    new Among("\u0575\u0578\u0582\u0576", -1, 1),
    new Among("\u0578\u0582\u0569\u0575\u0578\u0582\u0576", 15, 1),
    new Among("\u0561\u056E\u0578", -1, 1),
    new Among("\u056B\u0579", -1, 1),
    new Among("\u0578\u0582\u057D", -1, 1),
    new Among("\u0578\u0582\u057D\u057F", -1, 1),
    new Among("\u0563\u0561\u0580", -1, 1),
    new Among("\u057E\u0578\u0580", -1, 1),
    new Among("\u0561\u057E\u0578\u0580", 22, 1),
    new Among("\u0578\u0581", -1, 1),
    new Among("\u0561\u0576\u0585\u0581", -1, 1),
    new Among("\u0578\u0582", -1, 1),
    new Among("\u0584", -1, 1),
    new Among("\u0579\u0565\u0584", 27, 1),
    new Among("\u056B\u0584", 27, 1),
    new Among("\u0561\u056C\u056B\u0584", 29, 1),
    new Among("\u0561\u0576\u056B\u0584", 29, 1),
    new Among("\u057E\u0561\u056E\u0584", 27, 1),
    new Among("\u0578\u0582\u0575\u0584", 27, 1),
    new Among("\u0565\u0576\u0584", 27, 1),
    new Among("\u0578\u0576\u0584", 27, 1),
    new Among("\u0578\u0582\u0576\u0584", 27, 1),
    new Among("\u0574\u0578\u0582\u0576\u0584", 36, 1),
    new Among("\u056B\u0579\u0584", 27, 1),
    new Among("\u0561\u0580\u0584", 27, 1)
  };

  private static final Among a_3[] = {
    new Among("\u057D\u0561", -1, 1),
    new Among("\u057E\u0561", -1, 1),
    new Among("\u0561\u0574\u0562", -1, 1),
    new Among("\u0564", -1, 1),
    new Among("\u0561\u0576\u0564", 3, 1),
    new Among("\u0578\u0582\u0569\u0575\u0561\u0576\u0564", 4, 1),
    new Among("\u057E\u0561\u0576\u0564", 4, 1),
    new Among("\u0578\u057B\u0564", 3, 1),
    new Among("\u0565\u0580\u0564", 3, 1),
    new Among("\u0576\u0565\u0580\u0564", 8, 1),
    new Among("\u0578\u0582\u0564", 3, 1),
    new Among("\u0568", -1, 1),
    new Among("\u0561\u0576\u0568", 11, 1),
    new Among("\u0578\u0582\u0569\u0575\u0561\u0576\u0568", 12, 1),
    new Among("\u057E\u0561\u0576\u0568", 12, 1),
    new Among("\u0578\u057B\u0568", 11, 1),
    new Among("\u0565\u0580\u0568", 11, 1),
    new Among("\u0576\u0565\u0580\u0568", 16, 1),
    new Among("\u056B", -1, 1),
    new Among("\u057E\u056B", 18, 1),
    new Among("\u0565\u0580\u056B", 18, 1),
    new Among("\u0576\u0565\u0580\u056B", 20, 1),
    new Among("\u0561\u0576\u0578\u0582\u0574", -1, 1),
    new Among("\u0565\u0580\u0578\u0582\u0574", -1, 1),
    new Among("\u0576\u0565\u0580\u0578\u0582\u0574", 23, 1),
    new Among("\u0576", -1, 1),
    new Among("\u0561\u0576", 25, 1),
    new Among("\u0578\u0582\u0569\u0575\u0561\u0576", 26, 1),
    new Among("\u057E\u0561\u0576", 26, 1),
    new Among("\u056B\u0576", 25, 1),
    new Among("\u0565\u0580\u056B\u0576", 29, 1),
    new Among("\u0576\u0565\u0580\u056B\u0576", 30, 1),
    new Among("\u0578\u0582\u0569\u0575\u0561\u0576\u0576", 25, 1),
    new Among("\u0565\u0580\u0576", 25, 1),
    new Among("\u0576\u0565\u0580\u0576", 33, 1),
    new Among("\u0578\u0582\u0576", 25, 1),
    new Among("\u0578\u057B", -1, 1),
    new Among("\u0578\u0582\u0569\u0575\u0561\u0576\u057D", -1, 1),
    new Among("\u057E\u0561\u0576\u057D", -1, 1),
    new Among("\u0578\u057B\u057D", -1, 1),
    new Among("\u0578\u057E", -1, 1),
    new Among("\u0561\u0576\u0578\u057E", 40, 1),
    new Among("\u057E\u0578\u057E", 40, 1),
    new Among("\u0565\u0580\u0578\u057E", 40, 1),
    new Among("\u0576\u0565\u0580\u0578\u057E", 43, 1),
    new Among("\u0565\u0580", -1, 1),
    new Among("\u0576\u0565\u0580", 45, 1),
    new Among("\u0581", -1, 1),
    new Among("\u056B\u0581", 47, 1),
    new Among("\u057E\u0561\u0576\u056B\u0581", 48, 1),
    new Among("\u0578\u057B\u056B\u0581", 48, 1),
    new Among("\u057E\u056B\u0581", 48, 1),
    new Among("\u0565\u0580\u056B\u0581", 48, 1),
    new Among("\u0576\u0565\u0580\u056B\u0581", 52, 1),
    new Among("\u0581\u056B\u0581", 48, 1),
    new Among("\u0578\u0581", 47, 1),
    new Among("\u0578\u0582\u0581", 47, 1)
  };

  private static final char g_v[] = {209, 4, 128, 0, 18};

  private int I_p2;
  private int I_pV;

  private boolean r_mark_regions() {
    I_pV = limit;
    I_p2 = limit;
    int v_1 = cursor;
    lab0:
    {
      golab1:
      while (true) {
        lab2:
        {
          if (!(in_grouping(g_v, 1377, 1413))) {
            break lab2;
          }
          break golab1;
        }
        if (cursor >= limit) {
          break lab0;
        }
        cursor++;
      }
      I_pV = cursor;
      golab3:
      while (true) {
        lab4:
        {
          if (!(out_grouping(g_v, 1377, 1413))) {
            break lab4;
          }
          break golab3;
        }
        if (cursor >= limit) {
          break lab0;
        }
        cursor++;
      }
      golab5:
      while (true) {
        lab6:
        {
          if (!(in_grouping(g_v, 1377, 1413))) {
            break lab6;
          }
          break golab5;
        }
        if (cursor >= limit) {
          break lab0;
        }
        cursor++;
      }
      golab7:
      while (true) {
        lab8:
        {
          if (!(out_grouping(g_v, 1377, 1413))) {
            break lab8;
          }
          break golab7;
        }
        if (cursor >= limit) {
          break lab0;
        }
        cursor++;
      }
      I_p2 = cursor;
    }
    cursor = v_1;
    return true;
  }

  private boolean r_R2() {
    if (!(I_p2 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_adjective() {
    ket = cursor;
    if (find_among_b(a_0) == 0) {
      return false;
    }
    bra = cursor;
    slice_del();
    return true;
  }

  private boolean r_verb() {
    ket = cursor;
    if (find_among_b(a_1) == 0) {
      return false;
    }
    bra = cursor;
    slice_del();
    return true;
  }

  private boolean r_noun() {
    ket = cursor;
    if (find_among_b(a_2) == 0) {
      return false;
    }
    bra = cursor;
    slice_del();
    return true;
  }

  private boolean r_ending() {
    ket = cursor;
    if (find_among_b(a_3) == 0) {
      return false;
    }
    bra = cursor;
    if (!r_R2()) {
      return false;
    }
    slice_del();
    return true;
  }

  @Override
  public boolean stem() {
    r_mark_regions();
    limit_backward = cursor;
    cursor = limit;
    if (cursor < I_pV) {
      return false;
    }
    int v_3 = limit_backward;
    limit_backward = I_pV;
    int v_4 = limit - cursor;
    r_ending();
    cursor = limit - v_4;
    int v_5 = limit - cursor;
    r_verb();
    cursor = limit - v_5;
    int v_6 = limit - cursor;
    r_adjective();
    cursor = limit - v_6;
    int v_7 = limit - cursor;
    r_noun();
    cursor = limit - v_7;
    limit_backward = v_3;
    cursor = limit_backward;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof ArmenianStemmer;
  }

  @Override
  public int hashCode() {
    return ArmenianStemmer.class.getName().hashCode();
  }
}
