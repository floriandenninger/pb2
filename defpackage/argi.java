package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argi extends aonm implements aooz {
    public static final argi a;
    private static volatile aopf i;
    public int b;
    public long d;
    public boolean f;
    public float g;
    public int h;
    public String c = "";
    public aono e = emptyBooleanList();

    static {
        argi argiVar = new argi();
        a = argiVar;
        aonm.registerDefaultInstance(argi.class, argiVar);
    }

    private argi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u0019\u0004ဇ\u0002\u0005ခ\u0003\u0006ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", avcw.a()});
            case NEW_MUTABLE_INSTANCE:
                return new argi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (argi.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
