package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awed extends aonm implements aooz {
    public static final awed a;
    private static volatile aopf u;
    public int b;
    public float e;
    public float f;
    public double g;
    public awec h;
    public int k;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public String c = "";
    public String d = "";
    public aomf i = aomf.b;
    public aomf j = aomf.b;
    public float l = 1.0f;
    public String t = "";

    static {
        awed awedVar = new awed();
        a = awedVar;
        aonm.registerDefaultInstance(awed.class, awedVar);
    }

    private awed() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001a\u0012\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဉ\u0005\u0006ခ\t\u0007ဌ\n\bဌ\u000b\tင\f\nဇ\r\u000bဇ\u000e\fဇ\u000f\rဂ\u0010\u000eဌ\b\u000fဈ\u0011\u0011က\u0004\u0013ည\u0006\u001aည\u0007", new Object[]{"b", "c", "d", "e", "f", "h", "l", "m", apue.a(), "n", aweb.b, "o", "p", "q", "r", "s", "k", aweb.a, "t", "g", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new awed();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (awed.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
