package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgc {
    public final tge a;

    public tgc(tge tgeVar) {
        this.a = tgeVar;
    }

    public static tgc a() {
        return c().f();
    }

    public static awns b() {
        return new awns(22);
    }

    public static awns c() {
        return new awns(5);
    }

    public final String toString() {
        String str;
        String obj = super.toString();
        int l = anaf.l(this.a.c);
        if (l != 0) {
            if (l == 46) {
                str = "CAUSAL_USER_ACTION";
            } else if (l != 47) {
                switch (l) {
                    case 1:
                        break;
                    case 2:
                        str = "AUTOMATED";
                        break;
                    case 3:
                        str = "USER";
                        break;
                    case 4:
                        str = "GENERIC_CLICK";
                        break;
                    case 5:
                        str = "TAP";
                        break;
                    case 6:
                        str = "KEYBOARD_ENTER";
                        break;
                    case 7:
                        str = "MOUSE_CLICK";
                        break;
                    case 8:
                        str = "LEFT_CLICK";
                        break;
                    case 9:
                        str = "RIGHT_CLICK";
                        break;
                    case 10:
                        str = "HOVER";
                        break;
                    case 11:
                        str = "INTO_BOUNDING_BOX";
                        break;
                    case 12:
                        str = "OUT_OF_BOUNDING_BOX";
                        break;
                    case 13:
                        str = "PINCH";
                        break;
                    case 14:
                        str = "PINCH_OPEN";
                        break;
                    case 15:
                        str = "PINCH_CLOSED";
                        break;
                    case 16:
                        str = "INPUT_TEXT";
                        break;
                    case 17:
                        str = "INPUT_KEYBOARD";
                        break;
                    case 18:
                        str = "INPUT_VOICE";
                        break;
                    case 19:
                        str = "RESIZE_BROWSER";
                        break;
                    case 20:
                        str = "ROTATE_SCREEN";
                        break;
                    case 21:
                        str = "DIRECTIONAL_MOVEMENT";
                        break;
                    case 22:
                        str = "SWIPE";
                        break;
                    case 23:
                        str = "SCROLL_BAR";
                        break;
                    case 24:
                        str = "MOUSE_WHEEL";
                        break;
                    case 25:
                        str = "ARROW_KEYS";
                        break;
                    case 26:
                        str = "NAVIGATE";
                        break;
                    case 27:
                        str = "BACK_BUTTON";
                        break;
                    case 28:
                        str = "UNKNOWN_ACTION";
                        break;
                    case 29:
                        str = "HEAD_MOVEMENT";
                        break;
                    case 30:
                        str = "SHAKE";
                        break;
                    case 31:
                        str = "DRAG";
                        break;
                    case 32:
                        str = "LONG_PRESS";
                        break;
                    case 33:
                        str = "KEY_PRESS";
                        break;
                    case 34:
                        str = "ACTION_BY_TIMER";
                        break;
                    case 35:
                        str = "DOUBLE_CLICK";
                        break;
                    case 36:
                        str = "DOUBLE_TAP";
                        break;
                    case 37:
                        str = "ROLL";
                        break;
                    case 38:
                        str = "DROP";
                        break;
                    case 39:
                        str = "FORCE_TOUCH";
                        break;
                    case 40:
                        str = "MULTI_KEY_PRESS";
                        break;
                    case 41:
                        str = "TWO_FINGER_DRAG";
                        break;
                    case 42:
                        str = "ENTER_PROXIMITY";
                        break;
                    default:
                        str = "null";
                        break;
                }
            } else {
                str = "CAUSAL_AUTOMATED";
            }
            String valueOf = String.valueOf(this.a);
            int length = String.valueOf(obj).length();
            StringBuilder sb = new StringBuilder(length + 2 + str.length() + String.valueOf(valueOf).length());
            sb.append(obj);
            sb.append(" ");
            sb.append(str);
            sb.append(" ");
            sb.append(valueOf);
            return sb.toString();
        }
        str = "UNASSIGNED_USER_ACTION_ID";
        String valueOf2 = String.valueOf(this.a);
        int length2 = String.valueOf(obj).length();
        StringBuilder sb2 = new StringBuilder(length2 + 2 + str.length() + String.valueOf(valueOf2).length());
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
