package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzj extends aonm implements aooz {
    public static final arzj a;
    private static volatile aopf f;
    public int b;
    public arnb c;
    public boolean e;
    private byte g = 2;
    public aony d = aonm.emptyProtobufList();

    static {
        arzj arzjVar = new arzj();
        a = arzjVar;
        aonm.registerDefaultInstance(arzj.class, arzjVar);
    }

    private arzj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arzj();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arzj.class) {
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
