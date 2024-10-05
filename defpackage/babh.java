package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babh extends aonm implements aooz {
    public static final babh a;
    private static volatile aopf j;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int h;
    public aony e = aonm.emptyProtobufList();
    public aony i = aonm.emptyProtobufList();

    static {
        babh babhVar = new babh();
        a = babhVar;
        aonm.registerDefaultInstance(babh.class, babhVar);
    }

    private babh() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဋ\u0001\u0003\u001a\u0004ဋ\u0002\u0005ဌ\u0003\u0006င\u0004\u0007\u001a", new Object[]{"b", "c", "d", "e", "f", "g", axcs.o, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new babh();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (babh.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
