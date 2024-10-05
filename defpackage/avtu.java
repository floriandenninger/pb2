package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avtu extends aonm implements aooz {
    public static final avtu a;
    public static final aonk b;
    private static volatile aopf f;
    public avtt c;
    private int g;
    private byte h = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        avtu avtuVar = new avtu();
        a = avtuVar;
        aonm.registerDefaultInstance(avtu.class, avtuVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, avtuVar, avtuVar, null, 64128279, aoqn.MESSAGE, avtu.class);
    }

    private avtu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b", new Object[]{"g", "c", "d", avtw.class, "e", avtv.class});
            case NEW_MUTABLE_INSTANCE:
                return new avtu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avtu.class) {
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
