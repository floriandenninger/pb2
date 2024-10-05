package defpackage;

import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardb extends aonm implements aooz {
    private static volatile aopf Z;
    public static final ardb a;
    public auhs A;
    public ReelItemRendererOuterClass$ReelItemRenderer B;
    public avgr C;
    public avrp D;
    public avoa E;
    public avoq F;
    public avpd G;
    public avpe H;
    public avpg I;

    /* renamed from: J, reason: collision with root package name */
    public avqf f102J;
    public avqi K;
    public araq L;
    public araw M;
    public arap N;
    public aplo O;
    public aueq P;
    public auje Q;
    public atlg R;
    public atiw S;
    public aqzr T;
    public avpm U;
    public avkk V;
    public avvt W;
    public atjw X;
    public aqex Y;
    private byte aa = 2;
    public int b;
    public int c;
    public aqdb d;
    public aqgn e;
    public aqbj f;
    public aqcj g;
    public aqck h;
    public aqcb i;
    public avzx j;
    public arcl k;
    public arcn l;
    public arco m;
    public arcp n;
    public arcq o;
    public arcr p;
    public arct q;
    public arcu r;
    public arcw s;
    public arcx t;
    public ardc u;
    public ardf v;
    public ardd w;
    public astl x;
    public atke y;
    public auhg z;

    static {
        ardb ardbVar = new ardb();
        a = ardbVar;
        aonm.registerDefaultInstance(ardb.class, ardbVar);
    }

    private ardb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.aa);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.aa = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u00010\u0000\u0002\uf143ᠤ\uebbc꼧0\u0000\u00000\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0003\uef41ᠸᐉ\u0002\uea1cᯣᐉ\u0005飼\u1cc9ᐉ\u0007勤\u1cc9ᐉ\t暑\u1cc9ᐉ\r琢\u1cc9ᐉ\u0010啕\u1cc9ᐉ\u0012\ue52a᷒ᐉ\u0015\uf60fΆᐉ\b\ued8a♃ᐉ\u0006\ue0b4✰ᐉ\u000f\ueb31⣡ᐉ\u001a\uefa9Ⱡᐉ\u000e\uead4⸐ᐉ\u001f\ue3c8⹒ᐉ\u001e\ue5a9\u2e62ᐉ!\uf5b1⼞ᐉ\u0001\ue772⾩ᐉ\u001b數㉓ᐉ\u0011ﴻ㉳ᐉ\"\ue9f9㉴ᐉ#\uf04b㌶ᐉ%\uf062㝥ᐉ\u001d\ue53c䉁ᐉ'\ue92d䕝ᐉ\f﮻䕭ᐉ&\uf528䖉ᐉ\n\ue93c䖋ᐉ\u000b\uf0c1䣜ᐉ\u0004\uf411䫯ᐉ\u0016\uf423䫯ᐉ\u0017\ue156䯃ᐉ\u0018\uf72c䰍ᐉ/\uedf0䳞ᐉ(\uf556䷚ᐉ,\ue8d9侕ᐉ$\uf7bf卙ᐉ+זּ噾ᐉ)\uf078堽ᐉ\u0014\uec2c岒ᐉ*\ueaf6棪ᐉ\u001c\uf6ce淸ᐉ\u0019\ue7a1紕ᐉ-\uf3b0蘧ᐉ.\ufe53鯰ᐉ \uebbc꼧ᐉ\u0013", new Object[]{"b", "c", "d", "g", "f", "i", "k", "m", "q", "t", "v", "y", "l", "j", "s", "D", "r", "I", "H", "K", "e", "E", "u", "L", "M", "O", "G", "Q", "p", "P", "n", "o", "h", "z", "A", "B", "Y", "R", "V", "N", "U", "S", "x", "T", "F", "C", "W", "X", "J", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new ardb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = Z;
                if (aopfVar == null) {
                    synchronized (ardb.class) {
                        aopfVar = Z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            Z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
