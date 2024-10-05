package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumh extends aonm implements aooz {
    public static final aumh a;
    public static final aonk b;
    private static volatile aopf e;
    public aony c = emptyProtobufList();
    public String d = "";
    private int f;

    static {
        aumh aumhVar = new aumh();
        a = aumhVar;
        aonm.registerDefaultInstance(aumh.class, aumhVar);
        b = aonm.newSingularGeneratedExtension(aqro.a, aumhVar, aumhVar, null, 328964737, aoqn.MESSAGE, aumh.class);
    }

    private aumh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"f", "c", aumg.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aumh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aumh.class) {
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
