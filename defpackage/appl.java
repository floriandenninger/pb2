package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appl extends aonm implements aooz {
    public static final appl a;
    private static volatile aopf f;
    public int b;
    public appr c;
    public appo d;
    public appp e;
    private byte g = 2;

    static {
        appl applVar = new appl();
        a = applVar;
        aonm.registerDefaultInstance(appl.class, applVar);
    }

    private appl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uec7d⏫\uf4fb⮘\u0003\u0000\u0000\u0003\uec7d⏫ᐉ\u0000\uf2a2⤛ᐉ\u0001\uf4fb⮘ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new appl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (appl.class) {
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
