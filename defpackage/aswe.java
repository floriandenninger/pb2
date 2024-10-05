package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswe extends aonm implements aooz {
    public static final aswe a;
    private static volatile aopf n;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public String k = "";
    public boolean l;
    public boolean m;

    static {
        aswe asweVar = new aswe();
        a = asweVar;
        aonm.registerDefaultInstance(aswe.class, asweVar);
    }

    private aswe() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဌ\u0006\bဌ\u0007\tဈ\b\nဇ\t\u000bဇ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", atxj.b, "j", asvv.e, "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aswe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aswe.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
