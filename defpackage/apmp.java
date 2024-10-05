package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmp extends aonm implements aooz {
    public static final apmp a;
    private static volatile aopf w;
    public int b;
    public Object d;
    public boolean e;
    public boolean f;
    public arfs g;
    public aqyg h;
    public apmo j;
    public apxf k;
    public apxf l;
    public arfs m;
    public aqyg n;
    public apxf p;
    public apmq q;
    public aott r;
    public aott s;
    public boolean u;
    private aota x;
    public int c = 0;
    private byte y = 2;
    public String i = "";
    public String o = "";
    public String t = "";
    public aomf v = aomf.b;

    static {
        apmp apmpVar = new apmp();
        a = apmpVar;
        aonm.registerDefaultInstance(apmp.class, apmpVar);
    }

    private apmp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0001\u0001\u0001\u001a\u0015\u0000\u0000\t\u0001ြ\u0000\u0003ဇ\u0003\u0004ဇ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\t\bᐉ\u000b\tᐉ\f\nᐉ\u000e\fᐉ\u0017\rည\u0018\u000eဈ\u0007\u000fဈ\r\u0010ဉ\u000f\u0011ᐉ\n\u0012ᐉ\b\u0013ဉ\u0012\u0014ဉ\u0013\u0017ြ\u0000\u0018ဈ\u0015\u001aဇ\u0016", new Object[]{"d", "c", "b", apmq.class, "e", "f", "g", "h", "k", "m", "n", "p", "x", "v", "i", "o", "q", "l", "j", "r", "s", apmf.class, "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new apmp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = w;
                if (aopfVar == null) {
                    synchronized (apmp.class) {
                        aopfVar = w;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            w = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
