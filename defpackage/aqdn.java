package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdn extends aonm implements aooz {
    public static final aqdn a;
    private static volatile aopf k;
    public int b;
    public aqqa c;
    public aqdo d;
    public aqvp e;
    public int f;
    public int g;
    public aqdp h;
    public aqqa i;
    public boolean j;
    private aues l;

    static {
        aqdn aqdnVar = new aqdn();
        a = aqdnVar;
        aonm.registerDefaultInstance(aqdn.class, aqdnVar);
    }

    private aqdn() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006ဉ\u0005\bင\b\tင\u0006\nဉ\t\fဉ\n\rဇ\u000b", new Object[]{"b", "c", "d", "l", "e", "g", "f", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aqdn.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
