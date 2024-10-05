package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auui extends aonm implements aooz {
    public static final auui a;
    public static final aonk b;
    private static volatile aopf d;
    public auuj c;
    private int e;
    private byte f = 2;

    static {
        auui auuiVar = new auui();
        a = auuiVar;
        aonm.registerDefaultInstance(auui.class, auuiVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, auuiVar, auuiVar, null, 137739979, aoqn.MESSAGE, auui.class);
    }

    private auui() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new auui();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auui.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
