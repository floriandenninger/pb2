package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtv extends aonm implements aooz {
    public static final awtv a;
    public static final aonk b;
    private static volatile aopf c;
    private byte d = 2;

    static {
        awtv awtvVar = new awtv();
        a = awtvVar;
        aonm.registerDefaultInstance(awtv.class, awtvVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awtvVar, awtvVar, null, 334455667, aoqn.MESSAGE, awtv.class);
    }

    private awtv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new awtv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (awtv.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
