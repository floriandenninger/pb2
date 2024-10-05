package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrx extends aonm implements aooz {
    public static final asrx a;
    private static volatile aopf q;
    public int b;
    public asrv c;
    public long d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o = "";
    public int p;

    static {
        asrx asrxVar = new asrx();
        a = asrxVar;
        aonm.registerDefaultInstance(asrx.class, asrxVar);
    }

    private asrx() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rဈ\f\u000eဋ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new asrx();
            case NEW_BUILDER:
                return new asrw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (asrx.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
