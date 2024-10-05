package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asjc extends aonm implements aooz {
    public static final asjc a;
    private static volatile aopf e;
    public int b;
    public asjd c;
    private byte f = 2;
    public aony d = emptyProtobufList();

    static {
        asjc asjcVar = new asjc();
        a = asjcVar;
        aonm.registerDefaultInstance(asjc.class, asjcVar);
    }

    private asjc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"b", "c", "d", asjb.class});
            case NEW_MUTABLE_INSTANCE:
                return new asjc();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asjc.class) {
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
