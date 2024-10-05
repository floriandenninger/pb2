package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsp extends aonm implements aooz {
    public static final atsp a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awos d;
    public int e;
    private byte g = 2;

    static {
        atsp atspVar = new atsp();
        a = atspVar;
        aonm.registerDefaultInstance(atsp.class, atspVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, atspVar, atspVar, null, 250283977, aoqn.MESSAGE, atsp.class);
    }

    private atsp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", "e", aufc.a()});
            case NEW_MUTABLE_INSTANCE:
                return new atsp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atsp.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
