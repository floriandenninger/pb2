package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjn extends aonm implements aooz {
    public static final arjn a;
    private static volatile aopf d;
    public int b;
    private int e;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        arjn arjnVar = new arjn();
        a = arjnVar;
        aonm.registerDefaultInstance(arjn.class, arjnVar);
    }

    private arjn() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဋ\u0000\u0002Л", new Object[]{"e", "b", "c", atot.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arjn.class) {
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
