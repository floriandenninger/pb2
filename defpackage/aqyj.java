package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyj extends aonm implements aooz {
    public static final aqyj a;
    private static volatile aopf e;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public aony d = aonm.emptyProtobufList();

    static {
        aqyj aqyjVar = new aqyj();
        a = aqyjVar;
        aonm.registerDefaultInstance(aqyj.class, aqyjVar);
    }

    private aqyj() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\n\u0003\u0000\u0001\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\n\u001a", new Object[]{"c", "b", aqyk.class, aqyl.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqyj.class) {
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
