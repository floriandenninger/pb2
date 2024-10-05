package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpo extends aonh implements aoni {
    public static final aonv a = new atpn(0);
    public static final atpo b;
    private static volatile aopf g;
    public int c;
    public int d;
    private byte h = 2;
    public aonu e = emptyIntList();
    public aonu f = emptyIntList();

    static {
        atpo atpoVar = new atpo();
        b = atpoVar;
        aonm.registerDefaultInstance(atpo.class, atpoVar);
    }

    private atpo() {
    }

    public final void a() {
        aonu aonuVar = this.e;
        if (aonuVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonuVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001e\u0003\u0016", new Object[]{"c", "d", "e", atpl.a(), "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atpo();
            case NEW_BUILDER:
                return new aong(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atpo.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void e() {
        aonu aonuVar = this.f;
        if (aonuVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonuVar);
    }
}
