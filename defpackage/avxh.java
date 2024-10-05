package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxh extends aonm implements aooz {
    public static final avxh a;
    private static volatile aopf i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aony h = emptyProtobufList();

    static {
        avxh avxhVar = new avxh();
        a = avxhVar;
        aonm.registerDefaultInstance(avxh.class, avxhVar);
    }

    private avxh() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", avxa.a(), "g", avwz.a(), "h", avxe.class});
            case NEW_MUTABLE_INSTANCE:
                return new avxh();
            case NEW_BUILDER:
                return new aone((short[][]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avxh.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
