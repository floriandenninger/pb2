package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apsj extends aonm implements aooz {
    public static final apsj a;
    private static volatile aopf f;
    public int b;
    public apsn c;
    public apsk d;
    public apmh e;
    private apmh g;
    private apsh h;
    private apsi i;
    private byte j = 2;

    static {
        apsj apsjVar = new apsj();
        a = apsjVar;
        aonm.registerDefaultInstance(apsj.class, apsjVar);
    }

    private apsj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0007\r\u0006\u0000\u0000\u0006\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\u0004\rᐉ\u0005", new Object[]{"b", "g", "c", "h", "i", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apsj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apsj.class) {
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
