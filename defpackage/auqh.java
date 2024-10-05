package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqh extends aonm implements aooz {
    public static final auqh a;
    private static volatile aopf h;
    public int b;
    public int c;
    public aqyg d;
    public aqyg e;
    private aota i;
    private aupz j;
    private apmh k;
    private byte l = 2;
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        auqh auqhVar = new auqh();
        a = auqhVar;
        aonm.registerDefaultInstance(auqh.class, auqhVar);
    }

    private auqh() {
        aomf aomfVar = aomf.b;
    }

    public final void a() {
        aony aonyVar = this.f;
        if (aonyVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0002\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006\u001b\u0007ᐉ\u0004\tᐉ\u0006\nဌ\u0000\u000bᐉ\u0007", new Object[]{"b", "d", "e", "f", auqd.class, "g", auqx.class, "i", "j", "c", auqy.a, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auqh();
            case NEW_BUILDER:
                return new aone((float[]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auqh.class) {
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
