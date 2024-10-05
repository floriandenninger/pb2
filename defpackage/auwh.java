package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwh extends aonm implements aooz {
    public static final auwh a;
    private static volatile aopf h;
    public int b;
    public arfs e;
    public aott f;
    public arel g;
    private aota i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public String d = "";

    static {
        auwh auwhVar = new auwh();
        a = auwhVar;
        aonm.registerDefaultInstance(auwh.class, auwhVar);
    }

    private auwh() {
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
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0004\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ဉ\u0002\bᐉ\u0007\tᐉ\u0005", new Object[]{"b", "c", auwg.class, "d", "e", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auwh();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auwh.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
