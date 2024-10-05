package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfd extends aonm implements aooz {
    private static volatile aopf D;
    public static final arfd a;
    public aqvj A;
    public aunb B;
    public aqie C;
    private int E;
    private asle F;
    private atjc G;
    private avso H;
    private asjs I;

    /* renamed from: J, reason: collision with root package name */
    private byte f104J = 2;
    public int b;
    public astj c;
    public aspg d;
    public aswb e;
    public atfr f;
    public atph g;
    public avuj h;
    public atcl i;
    public atys j;
    public aulw k;
    public atcb l;
    public asuj m;
    public aunv n;
    public apbs o;
    public atog p;
    public auzu q;
    public aqbc r;
    public avxn s;
    public aujg t;
    public aujs u;
    public aqrt v;
    public attq w;
    public aoub x;
    public avdz y;
    public autm z;

    static {
        arfd arfdVar = new arfd();
        a = arfdVar;
        aonm.registerDefaultInstance(arfd.class, arfdVar);
    }

    private arfd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f104J);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f104J = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002︿Ḗ\ue537밄\u001f\u0000\u0000\u0004︿Ḗᐉ\u0012\ue647㸷ᐉ\u0002\uef2e㻝ဉ\u0007\uee04㻱ဉ\t\ue698㼮ဉ\u0006\ue621㽲ᐉ\b\uf0fb㿓ဉ\f\ue518䃘ဉ\u0004\ue61a䈏ᐉ\u000e\ue973䈱ဉ\u000f\ue40d䓘ဉ\u0010\ue58c䘐ဉ\u0011\ue8dd䘱ဉ\u0013\uf40d䝠ဉ\u0014\ue29c䪉ဉ\u0015\uf45e䴰ဉ\u0016\ue1ad侷ဉ\u0019\ue722俫ဉ\u0005\ue124八ဉ\u001a\ue662君ဉ\u001c\ued51弐ဉ\u001d\uea48摧ဉ\u001e\ue435撄ဉ\u001f\ue46e炂ဉ!\ue475爜ဉ\"\uf199疺ဉ$\ue954趱ဉ\u0017ﴌ蹎ဉ%\uefebꕋဉ'\ufaf1ꕋဉ(\ue537밄ဉ*", new Object[]{"b", "E", "H", "F", "f", "g", "e", "G", "h", "c", "i", "j", "k", "l", "m", "n", "o", "p", "r", "d", "I", "s", "t", "u", "v", "w", "x", "y", "q", "z", "A", "B", "C"});
            case NEW_MUTABLE_INSTANCE:
                return new arfd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = D;
                if (aopfVar == null) {
                    synchronized (arfd.class) {
                        aopfVar = D;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            D = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
