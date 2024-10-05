package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgg extends aonh implements aoni {
    public static final avgg a;
    private static volatile aopf j;
    public int b;
    public aott d;
    public avgd e;
    public boolean f;
    public avge g;
    public asnf h;
    public asnf i;
    private byte k = 2;
    public aony c = emptyProtobufList();

    static {
        avgg avggVar = new avgg();
        a = avggVar;
        aonm.registerDefaultInstance(avgg.class, avggVar);
    }

    private avgg() {
        aomf aomfVar = aomf.b;
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0002\u0007ဉ\u0005\u000bဇ\u0007\fဉ\b\rဉ\t\u000eဉ\n", new Object[]{"b", "c", avgf.class, "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avgg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avgg.class) {
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
