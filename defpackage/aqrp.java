package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrp extends aonm implements aooz {
    public static final aqrp a;
    public static final aonk b;
    private static volatile aopf d;
    private byte e = 2;
    public aony c = emptyProtobufList();

    static {
        aqrp aqrpVar = new aqrp();
        a = aqrpVar;
        aonm.registerDefaultInstance(aqrp.class, aqrpVar);
        b = aonm.newSingularGeneratedExtension(aqzg.a, aqrpVar, aqrpVar, null, 2, aoqn.MESSAGE, aqrp.class);
    }

    private aqrp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", aqro.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqrp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqrp.class) {
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
