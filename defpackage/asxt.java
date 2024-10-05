package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxt extends aonm implements aooz {
    public static final asxt a;
    public static final aonk b;
    private static volatile aopf r;
    public int c;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public avgg j;
    public aqyg k;
    public long l;
    public long m;
    public long n;
    public awjm o;
    public asxv p;
    public String q;
    private byte s = 2;
    public String d = "";

    static {
        asxt asxtVar = new asxt();
        a = asxtVar;
        aonm.registerDefaultInstance(asxt.class, asxtVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, asxtVar, asxtVar, null, 261, aoqn.MESSAGE, asxt.class);
    }

    private asxt() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.q = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0002\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tᐉ\b\nဃ\t\u000bဃ\n\fဃ\u000b\rဉ\f\u000eဉ\r\u000fဈ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new asxt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (asxt.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
