package ZIPlayer;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.scene.media.*;
import javafx.stage.FileChooser;
import javafx.scene.paint.Color;

/**
 *
 * @author ZI
 */


public class FXMLMainFormController implements Initializable
{
    // Vidual components
    @FXML private Button btnPlay;
    @FXML private Canvas vumeter;
    @FXML private Slider e32, e64, e125, e250, e500, e1000, e2000, e4000,
            e8000, e16000;
    
    // Global cariables
    private Media media = null;
    private MediaPlayer mediaPlayer = null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        // Initizlilize equalizer slider's
        e32.setMin(EqualizerBand.MIN_GAIN);
        e32.setMax(EqualizerBand.MAX_GAIN);
        e64.setMin(EqualizerBand.MIN_GAIN);
        e64.setMax(EqualizerBand.MAX_GAIN);
        e125.setMin(EqualizerBand.MIN_GAIN);
        e125.setMax(EqualizerBand.MAX_GAIN);
        e250.setMin(EqualizerBand.MIN_GAIN);
        e250.setMax(EqualizerBand.MAX_GAIN);
        e500.setMin(EqualizerBand.MIN_GAIN);
        e500.setMax(EqualizerBand.MAX_GAIN);
        e1000.setMin(EqualizerBand.MIN_GAIN);
        e1000.setMax(EqualizerBand.MAX_GAIN);
        e2000.setMin(EqualizerBand.MIN_GAIN);
        e2000.setMax(EqualizerBand.MAX_GAIN);
        e4000.setMin(EqualizerBand.MIN_GAIN);
        e4000.setMax(EqualizerBand.MAX_GAIN);
        e8000.setMin(EqualizerBand.MIN_GAIN);
        e8000.setMax(EqualizerBand.MAX_GAIN);
        e16000.setMin(EqualizerBand.MIN_GAIN);
        e16000.setMax(EqualizerBand.MAX_GAIN);
        e32.setValue(0);
        e64.setValue(0);
        e125.setValue(0);
        e250.setValue(0);
        e500.setValue(0);
        e1000.setValue(0);
        e2000.setValue(0);
        e4000.setValue(0);
        e8000.setValue(0);
        e16000.setValue(0);
        
        // Set equalizer slider bards's events
        e32.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(0, new EqualizerBand
                                (32, 19, new_val.doubleValue()));
                        }
                    }
                });
        e64.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(1, new EqualizerBand
                                (64, 39, new_val.doubleValue()));
                        }
                    }
                });
        e125.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(2, new EqualizerBand
                                (125, 78, new_val.doubleValue()));
                        }
                    }
                });
        e250.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(3, new EqualizerBand
                                (250, 156, new_val.doubleValue()));
                        }
                    }
                });
        e500.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(4, new EqualizerBand
                                (500, 312, new_val.doubleValue()));
                        }
                    }
                });
        e1000.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(5, new EqualizerBand
                                (1000, 625, new_val.doubleValue()));
                        }
                    }
                });
        e2000.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(6, new EqualizerBand
                                (2000, 1250, new_val.doubleValue()));
                        }
                    }
                });
        e4000.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(7, new EqualizerBand
                                (4000, 2500, new_val.doubleValue()));
                        }
                    }
                });
        e8000.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(8, new EqualizerBand
                                (8000, 5000, new_val.doubleValue()));
                        }
                    }
                });
        e16000.valueProperty().addListener(new ChangeListener<Number>()
                {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                            Number old_val, Number new_val)
                    {
                        if(mediaPlayer != null)
                        {
                            ObservableList<EqualizerBand> bands =
                                    mediaPlayer.getAudioEqualizer().getBands();
                            bands.set(9, new EqualizerBand
                                (16000, 10000, new_val.doubleValue()));
                        }
                    }
                });
    }
    
    /*
     * Events
     */

    @FXML
    private void playOnClick(ActionEvent e)
    {
        if(((Button) e.getSource()).getText().toString().equals("Play"))
        {
            if(mediaPlayer != null)
            {
                ((Button) e.getSource()).setText("Pause");
                mediaPlayer.play();
                
                // Vu meter render when mediaPlayer is playing
                mediaPlayer.setOnPlaying(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            drawVuMeter();
                        }
                    });
            }
        } else
        {
            if(mediaPlayer != null)
            {
                ((Button) e.getSource()).setText("Play");
                mediaPlayer.pause();
            }
        }
    }

    @FXML
    private void stopOnClick(ActionEvent e)
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.stop();
        }
        btnPlay.setText("Play");
    }

    @FXML
    private void openOnClick(ActionEvent e)
    {
        FileChooser fc = new FileChooser();
        File file = null;
        
        fc.setTitle("ziPlayer - Open track");
        file = fc.showOpenDialog(null);
        if(file != null)
        {
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
        }
        
        /*
        mediaPlayer.getAudioEqualizer().getBands().set(0, new EqualizerBand(32, 19, 0));
        */
    }
    
    /*
     * Functions
     */
    
    private void drawVuMeter()
    {
        GraphicsContext gc = vumeter.getGraphicsContext2D();
        gc.clearRect(0, 0, vumeter.getWidth(), vumeter.getHeight());
        
        /*
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.PINK);
        
        gc.stroke...;
        */
        
        gc.setStroke(Color.BLACK);
        gc.strokeRect(0, 0, 100, 100);
    }
}
