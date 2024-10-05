package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqft extends aonm implements aooz {
    public static final aqft a;
    private static volatile aopf b;
    private int c;
    private aqfm d;
    private aulq e;
    private aulq f;
    private aqyg g;
    private atdf h;
    private aqfs i;
    private apxf j;
    private aota k;
    private aqyg l;
    private aulq m;
    private byte n = 2;

    static {
        aqft aqftVar = new aqft();
        a = aqftVar;
        aonm.registerDefaultInstance(aqft.class, aqftVar);
    }

    private aqft() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0005\u001d\n\u0000\u0000\n\u0005ᐉ\u0006\tᐉ\b\u000bᐉ\t\u000fᐉ\f\u0010ᐉ\n\u0012ᐉ\u0002\u0014ᐉ\u000e\u0018ᐉ\u0011\u001cᐉ\u0003\u001dᐉ\u0004", new Object[]{"c", "g", "h", "i", "k", "j", "d", "l", "m", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqft();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqft.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
