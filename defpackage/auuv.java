package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auuv extends aonm implements aooz {
    public static final auuv a;
    private static volatile aopf f;
    public int b;
    public boolean d;
    public aqyg e;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        auuv auuvVar = new auuv();
        a = auuvVar;
        aonm.registerDefaultInstance(auuv.class, auuvVar);
    }

    private auuv() {
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
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ဇ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", auuw.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new auuv();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auuv.class) {
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
