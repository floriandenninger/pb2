package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovi extends aonm implements aooz {
    public static final ovi a;
    private static volatile aopf e;
    public int b;
    public aonu c;
    public String d;

    static {
        ovi oviVar = new ovi();
        a = oviVar;
        aonm.registerDefaultInstance(ovi.class, oviVar);
    }

    private ovi() {
        emptyIntList();
        this.c = emptyIntList();
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u0016\u0003ဈ\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ovi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ovi.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
