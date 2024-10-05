package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyk extends aonm implements aooz {
    public static final atyk a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public atym e;
    public aulq f;
    public boolean g;
    private atyo i;
    public int c = 0;
    private byte j = 2;

    static {
        atyk atykVar = new atyk();
        a = atykVar;
        aonm.registerDefaultInstance(atyk.class, atykVar);
    }

    private atyk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ှ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ျ\u0000\u0006ဇ\u0005", new Object[]{"d", "c", "b", "i", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atyk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atyk.class) {
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
