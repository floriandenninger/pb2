package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmt extends aonm implements aooz {
    public static final avmt a;
    private static volatile aopf i;
    public int b;
    public avmh c;
    public avmb e;
    public avlw f;
    public aony g;
    public avmj h;
    private aqyg j;
    private aplk k;
    private aota l;
    private aqfc m;
    private aqyg n;
    private aulq o;
    private byte p = 2;
    public aony d = emptyProtobufList();

    static {
        avmt avmtVar = new avmt();
        a = avmtVar;
        aonm.registerDefaultInstance(avmt.class, avmtVar);
    }

    private avmt() {
        aomf aomfVar = aomf.b;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\f\u0001ᐉ\u0002\u0002Л\u0003ᐉ\u0003\u0004ᐉ\u0000\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\b\tᐉ\u0007\nЛ\u000bᐉ\u0001\fᐉ\t\u000eᐉ\n", new Object[]{"b", "j", "d", avmk.class, "k", "c", "l", "m", "n", "f", "g", apxf.class, "e", "h", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new avmt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avmt.class) {
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
