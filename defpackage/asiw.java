package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asiw extends aonm implements aooz {
    public static final asiw a;
    private static volatile aopf m;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public avgg i;
    public aqyg k;
    public aulq l;
    public int c = 0;
    private byte n = 2;
    public aony h = emptyProtobufList();
    public aony j = emptyProtobufList();

    static {
        asiw asiwVar = new asiw();
        a = asiwVar;
        aonm.registerDefaultInstance(asiw.class, asiwVar);
    }

    private asiw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0002\n\t\u0000\u0002\t\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐼ\u0000\u0007ᐉ\u0005\bЛ\tᐉ\u0006\nᐉ\u0007", new Object[]{"d", "c", "b", "e", "f", "g", "h", aulq.class, avgg.class, "i", "j", aulq.class, "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asiw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asiw.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
