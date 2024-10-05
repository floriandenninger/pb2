package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujk extends aonm implements aooz {
    public static final aujk a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public apxf e;
    public aulq f;
    public boolean g;
    private aota i;
    public int c = 0;
    private byte j = 2;

    static {
        aujk aujkVar = new aujk();
        a = aujkVar;
        aonm.registerDefaultInstance(aujk.class, aujkVar);
    }

    private aujk() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐼ\u0000\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐼ\u0000\bဇ\u0007", new Object[]{"d", "c", "b", "e", avxs.class, "i", "f", avcy.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aujk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aujk.class) {
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
