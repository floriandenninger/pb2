package androidx.window.layout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class EmptyDecorator implements WindowInfoRepositoryDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoRepositoryDecorator
    public WindowInfoRepository decorate(WindowInfoRepository windowInfoRepository) {
        windowInfoRepository.getClass();
        return windowInfoRepository;
    }
}
