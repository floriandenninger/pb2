package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auph extends aonm implements aooz {
    public static final auph a;
    public static final aonk b;
    private static volatile aopf g;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        auph auphVar = new auph();
        a = auphVar;
        aonm.registerDefaultInstance(auph.class, auphVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, auphVar, auphVar, null, 362581600, aoqn.MESSAGE, auph.class);
    }

    private auph() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auph();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auph.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
